package com.threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
 
public class OvalGameSync extends Frame implements Runnable{

Thread t1, t2, t3;
int y1 = 400, y2 = 400, y3 = 400;
public OvalGameSync() {
super("Ball game");
t1= new Thread(this);
t2= new Thread(this);
t3= new Thread(this);
t1.setName("RED");
t2.setName("GREEN");
t3.setName("BLUE");
t1.start();
t2.start();
t3.start();


setBackground(Color.black);
setSize(500, 1000);
setVisible(true);
this.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
}
@Override
public synchronized void run() {
Thread currentThread=Thread.currentThread();

if(currentThread.getName().equals("RED")) {
int k=0;
while(true) {
k++;
if(k%2!=0) {
for(int i=0;i<250;i++) {

y1 = y1 - 1;
repaint();


try {
Thread.sleep(1);
}
catch(InterruptedException e) {
System.out.println(e);
}
}


}
else if(k%2==0) {
for(int i=0;i<250;i++) {

y1 = y1 + 1;
repaint();
try {
Thread.sleep(1);
}
catch(InterruptedException e) {
System.out.println(e);
}
}
}
}
}
else if(currentThread.getName().equals("GREEN")) {
int k=0;
while(true) {
k++;
if(k%2!=0) {
for(int i=0;i<250;i++) {
y2 = y2 - 1;
repaint();
try {
Thread.sleep(2);
}
catch(InterruptedException e) {
System.out.println(e);
}
}
}
else if(k%2==0) {
for(int i=0;i<250;i++) {
y2 = y2 + 1;
repaint();
try {
Thread.sleep(2);
}
catch(InterruptedException e) {
System.out.println(e);
}
}
}

}
}
else if(currentThread.getName().equals("BLUE")) {
int k=0;
while(true) {
k++;
if(k%2!=0) {
for(int i=0;i<250;i++) {
y3 = y3 - 1;
repaint();
try {
Thread.sleep(3);
}
catch(InterruptedException e) {
System.out.println(e);
}
}

}
else if(k%2==0) {
for(int i=0;i<250;i++) {
y3 = y3 + 1;
repaint();
try {
Thread.sleep(3);
}
catch(InterruptedException e) {
System.out.println(e);
}
}

}
}
}
}
public void paint(Graphics g) {
g.setColor(Color.RED);
g.fillOval(100, y1, 50, 50);
g.setColor(Color.GREEN);
g.fillOval(200, y2, 50, 50);
g.setColor(Color.BLUE);
g.fillOval(300, y3, 50, 50);
}

public static void main(String[] args) {
Frame mf = new OvalGameSync();
mf.setSize(500, 500);
mf.setVisible(true);
}



}